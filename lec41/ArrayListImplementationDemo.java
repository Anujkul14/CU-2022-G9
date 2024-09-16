package lec41;

import java.util.ArrayList;

public class ArrayListImplementationDemo {
    static class MyArrayList<T>
    {
        private Object[] arr = new Object[10];
        int capacity = 10;
        int size = 0;

        public void add(T val)
        {
            if(size == capacity)
            {
                capacity = capacity +(capacity / 2);
                Object[] temp = new Object[capacity];
                for(int i = 0;i < size;i++)
                {
                    temp[i] = arr[i];
                }
                temp[size] = val;
                arr = temp;
                size++;
            }
        }

        public T get(int idx)
        {
            return (T)arr[idx];
        }

        public void set(int index,T val)
        {
            arr[index] = val;
        }

        public T remove() {
            T oldValue = (T) arr[size - 1];
            arr[size - 1] = null;
            size--;
            return oldValue;
        }

        public String toString() {
            StringBuilder res = new StringBuilder("[");
            for (int idx = 0; idx < size; idx++) {
                res.append(arr[idx]).append(", ");
            }
            if (size > 0) {
                res.setCharAt(res.length() - 2, ']');
                res.deleteCharAt(res.length() - 1);
            } else {
                res.append("]");
            }
            return res.toString();
        }

    }


    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(20);
        al.add(30);

        System.out.println(al.get(0));
        System.out.println(al.get(1));

        al.set(2,40);

        al.remove(1);
        System.out.println(al.get(1));
       

    }
}
