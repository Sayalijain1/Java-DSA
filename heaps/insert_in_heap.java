import java.util.ArrayList;

public class insert_in_heap 
{
    static class heap
    {
        ArrayList<Integer> arr = new ArrayList<>();
        public void add(int data)
        {
            //add at last index
            arr.add(data);
            int x = arr.size()-1;//child index
            int parent = (x-1)/2;//parent index
            while (arr.get(x)<arr.get(parent)) {
                //swap
                int temp = arr.get(x);
                arr.set(x, arr.get(parent));
                arr.set(parent, temp);
                x = parent;
                parent=(x-1)/2;
            }

        }
        public int peek(){
            return arr.get(0);
        }

        private void heapify(int i) {
            int left = 2 * i + 1;
            int right = 2 * i + 2;
            int min_idx = i;
        
            if (left < arr.size() && arr.get(left) < arr.get(min_idx)) {
                min_idx = left;
            }
            if (right < arr.size() && arr.get(right) < arr.get(min_idx)) {
                min_idx = right;
            }
            
            if (min_idx != i) {
                int temp = arr.get(i);
                arr.set(i, arr.get(min_idx));
                arr.set(min_idx, temp);
                heapify(min_idx); // Recursively heapify the affected subtree
            }
        }
        
        public int remove(){
            int data=arr.get(0);
            int temp = arr.get(0);
            arr.set(0, arr.get(arr.size()-1));
            arr.set(arr.size()-1, temp);
            arr.remove(arr.size()-1);
            heapify(0);
            return data;
        }
        public boolean isEmpty(){
            return arr.size()==0;
        }
    }
    public static void main(String[] args) {
        heap pq = new heap();
        pq.add(3);
        pq.add(4);
        pq.add(1);
        pq.add(5);
        while (!pq.isEmpty()) {
            System.out.println(pq.peek());
            pq.remove();
        }
    }
}
