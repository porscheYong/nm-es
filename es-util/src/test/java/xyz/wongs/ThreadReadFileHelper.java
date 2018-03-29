//package xyz.wongs;
//
//import java.io.*;
//import java.nio.ByteBuffer;
//import java.nio.CharBuffer;
//import java.nio.charset.Charset;
//import java.security.InvalidParameterException;
//import java.util.Random;
//import java.util.UUID;
//import java.util.concurrent.ExecutorService;
//import java.util.concurrent.Executors;
//import java.util.concurrent.atomic.AtomicInteger;
//
///**
// * @author WCNGS@QQ.CO
// * @version V1.0
// * @Title:
// * @Package
// * @Description: TODO
// * @date
// **/
//public class ThreadReadFileHelper {
//
//
//    private static AtomicInteger atomicInteger = new AtomicInteger(0);
//
//    // 模拟数据
//    private static void writeData() throws FileNotFoundException, IOException {
//        FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\lianghaohui\\Desktop\\test.txt");
//        Random random = new Random();
//        for (int n = 0; n < 1000000; n++) {
//            int count = random.nextInt(10) + 1;
//            StringBuilder builder = new StringBuilder();
//
//            for (int i = 0; i < count; i++) {
//                builder.append(UUID.randomUUID().toString());
//            }
//
//            builder.append("\n");
//            fileOutputStream.write(builder.toString().getBytes());
//        }
//        fileOutputStream.close();
//        System.out.println("ok");
//    }
//
//    public void read(String path, int threadCount, char separator, StringCallback callback) throws IOException {
//
//        if (threadCount < 1) {
//            throw new InvalidParameterException("The threadCount can not be less than 1");
//        }
//
//        if (path == null || path.isEmpty()) {
//            throw new InvalidParameterException("The path can not be null or empty");
//        }
//
//        if (callback == null) {
//            throw new InvalidParameterException("The callback can not be null");
//        }
//
//        RandomAccessFile randomAccessFile = new RandomAccessFile(path, "r");
//
//        long fileTotalLength = randomAccessFile.length();
//        long gap = fileTotalLength / threadCount;
//        long checkIndex = 0;
//        long[] beginIndexs = new long[threadCount];
//        long[] endIndexs = new long[threadCount];
//
//        for (int n = 0; n < threadCount; n++) {
//            beginIndexs[n] = checkIndex;
//            if (n + 1 == threadCount) {
//                endIndexs[n] = fileTotalLength;
//                break;
//            }
//            checkIndex += gap;
//            long gapToEof = getGapToEof(checkIndex, randomAccessFile, separator);
//
//            checkIndex += gapToEof;
//            endIndexs[n] = checkIndex;
//        }
//
//        ExecutorService executorService = Executors.newFixedThreadPool(threadCount);
//        executorService.execute(() -> {
//            try {
//                readData(beginIndexs[0], endIndexs[0], path, randomAccessFile, separator, callback);
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        });
//
//        for (int n = 1; n < threadCount; n++) {
//            long begin = beginIndexs[n];
//            long end = endIndexs[n];
//            executorService.execute(() -> {
//                try {
//                    readData(begin, end, path, null, separator, callback);
//                } catch (Exception e) {
//                    e.printStackTrace();
//                }
//            });
//        }
//    }
//
//    private long getGapToEof(long beginIndex, RandomAccessFile randomAccessFile, char separator) throws IOException {
//        randomAccessFile.seek(beginIndex);
//        long count = 0;
//
//        while (randomAccessFile.read() != separator) {
//            count++;
//        }
//
//        count++;
//
//        return count;
//    }
//
//
//    private void readData(long begin, long end, String path, RandomAccessFile randomAccessFile, char separator, StringCallback callback) throws FileNotFoundException, IOException {
////        System.out.println("开始工作" + Thread.currentThread().getName());
//        if (randomAccessFile == null) {
//            randomAccessFile = new RandomAccessFile(path, "r");
//        }
//
//        randomAccessFile.seek(begin);
//        StringBuilder builder = new StringBuilder();
//
//        while (true) {
//            int read = randomAccessFile.read();
//            begin++;
//            if (separator == read) {
//                if (callback != null) {
//                    callback.callback0(builder.toString());
//                }
//                builder = new StringBuilder();
//            } else {
//                builder.append((char) read);
//            }
//
//            if (begin >= end) {
//                break;
//            }
//        }
//        randomAccessFile.close();
//    }
//
//    public static abstract class StringCallback {
//        private String charsetName;
//        private ExecutorService executorService = Executors.newSingleThreadExecutor();
//
//        public StringCallback(String charsetName) {
//            this.charsetName = charsetName;
//        }
//
//        private void callback0(String data) {
//            executorService.execute(() -> {
//                try {
//                    callback(new String(data.getBytes("ISO-8859-1"), charsetName));
//                } catch (UnsupportedEncodingException e) {
//                    e.printStackTrace();
//                }
//            });
//
//        }
//
//        abstract void callback(String data);
//    }
//
//
//    public static char getChar(byte bytes) {
//        Charset cs = Charset.forName ("UTF-8");
//        ByteBuffer bb = ByteBuffer.allocate (1);
//        bb.put (bytes);
//        bb.flip ();
//        CharBuffer cb = cs.decode (bb);
//
//        char [] tmp = cb.array();
//
//        return tmp[0];
//    }
//
//    public static void main(String[] args) throws Exception {
//        long beginTime = System.currentTimeMillis();
//        int  b2 = 0x0D0A;
//        char str1 = (char)b2;
//
//        ThreadReadFileHelper helper = new ThreadReadFileHelper();
//        helper.read("G:\\UECC\\LDAPM_MPW_BM_DATA.20171206.201712.00.001.001.815.DAT", Runtime.getRuntime().availableProcessors(), str1, new StringCallback("GBK") {
//            @Override
//            void callback(String data) {
//                int count = atomicInteger.incrementAndGet();
//                System.out.println(count+" ==> "+data);
//            }
//        });
//
//    }
//}
