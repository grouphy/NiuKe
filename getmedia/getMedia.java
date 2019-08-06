package getmedia;

import java.util.ArrayList;

/**
 * Created With IntelliJ IDEA.
 * Descriptions:如何得到一个数据流中的中位数？如果从数据流中读出奇数个数值，那么中位数就是所有数值排序之后位于中间的数值。
 * 如果从数据流中读出偶数个数值，那么中位数就是所有数值排序之后中间两个数的平均值。我们使用Insert()方法读取数据流，
 * 使用GetMedian()方法获取当前读取数据的中位数。
 * User:Mr.Du
 * Date:2019/8/6
 * Time:23:24
 */
public class getMedia {

    public ArrayList<Integer> arr = new ArrayList<>();

    public void Insert(Integer num) {
        int curSize = arr.size();
        int index = 0;
        int i;
        for (i = 0; i < curSize; i++) {
            if (num <= arr.get(i)) {
                index = i;
                break;
            }
        }
        if (i == curSize)
            index = curSize;

        arr.add(index,num);
    }

    public Double GetMedian() {

        int size = arr.size();
        if (size % 2 == 0) {
            return ((double)(arr.get(size / 2) + arr.get(size / 2 - 1)) / 2);
        } else {
            return Double.valueOf(arr.get(size / 2));
        }

    }
}
