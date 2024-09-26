package lec49;

public class ArrayListImplementationDemo {
    static class MyArrayList<T> {
        private Object[] data = new Object[10];
        private int capacity = 10;
        private int size = 0;

        public T get(int idx) {
            return (T) data[idx];
        }

        public void set(T val, int idx) {
            data[idx] = val;
        }

        public void add(T val) {
            if (size == capacity) {
                capacity = capacity + capacity / 2;
                Object[] copy = new Object[capacity];
                for (int idx = 0; idx < data.length; idx++) {
                    copy[idx] = data[idx];
                }
                data = copy;
            }
            data[size] = val;
            size++;
        }

        public T remove() {
            T oldValue = (T) data[size - 1];
            data[size - 1] = null;
            size--;
            return oldValue;
        }

        public String toString() {
            StringBuilder res = new StringBuilder("[");
            for (int idx = 0; idx < size; idx++) {
                res.append(data[idx]).append(", ");
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
        MyArrayList<Integer> list = new MyArrayList<>();
        list.add(10);
        list.add(20);
        System.out.println(list);
    }
}



