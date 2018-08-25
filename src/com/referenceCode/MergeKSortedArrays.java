package com.referenceCode;

public class MergeKSortedArrays {
    /*
    Given k sorted arrays, merge them into a single sorted array.

    eg.
    merge({1,4,7},{2,5,8},{3,6,9}})

    {1,2,3,4,5,6,7,8,9}

     */

    public static void main(String[] args) {

    }

//    public static int[] merge(int[][] arrays){
//        PriortyQueue<QueueNode> pq = new PriortyQueue<QueueNode>();
//
//        int size = 0;
//        for(int i = 0; i < arrays.length; i++){
//            size += arrays[i].length;
//            if (arrays[i].length > 0){
//                pq.add(new QueueNode(i, 0, arrays[i][0]));
//            }
//        }
//
//        int[] result = new int[size];
//        for (int i = 0; !pq.isEmpty(); i++){
//            QueueNode n = pq.poll();
//            result[i] = n.value;
//            int newIndex = n.index + 1;
//            if (newIndex < arrays[n.array].length){
//                pq.add(new QueueNode(n.array, newIndex,
//                        arrays[n.array][newIndex]));
//            }
//        }
//
//        return result;
//    }

    private static class QueueNode implements Comparable<QueueNode> {
        int array, index, value;

        public QueueNode(int array, int index, int value) {
            this.array = array;
            this.index = index;
            this.value = value;
        }

        public int compareTo(QueueNode n) {
            if (value > n.value) return 1;
            if (value < n.value) return -1;
            return 0;
        }
    }
}
