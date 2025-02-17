public class HeapSort {

    public static void heap_sort(int[] array) {
        int size = array.length - 1;
        
        // TODO: Task 1: Implement Heapsort as specified in lab PDF

        /* 𝒇𝒐𝒓 𝑖 = 𝐴. 𝑙𝑒𝑛𝑔𝑡h/2 𝒕𝒐 1 𝒅𝒐
            𝑀𝑎𝑥𝐻𝑒𝑎𝑝𝑖𝑓𝑦(𝐴, 𝑖, 𝐴. h𝑒𝑎𝑝_𝑠𝑖𝑧𝑒) 
        𝒆𝒏𝒅

        𝒇𝒐𝒓 𝑖 = 𝐴. 𝑙𝑒𝑛𝑔𝑡h 𝒕𝒐 2 𝒅𝒐 
            𝑠𝑤𝑎𝑝(𝐴[𝑖], 𝐴[1])
            𝐴. h𝑒𝑎𝑝_𝑠𝑖𝑧𝑒 = 𝐴. h𝑒𝑎𝑝_𝑠𝑖𝑧𝑒 – 1 
            𝑀𝑎𝑥𝐻𝑒𝑎𝑝𝑖𝑓𝑦(𝐴, 1, 𝐴. h𝑒𝑎𝑝_𝑠𝑖𝑧𝑒)
        𝒆𝒏𝒅 */

        for (int i = array.length/2; i >= 1; i--) {
            heapify(array, i, size);
        }

        for (int i = size; i >= 2; i--) { // use size not array.len(=size-1) bc not considering -1 at end
            swap(i, 1, array);
            size--;
            heapify(array, 1, size);
        }

    }

    private static void heapify(int[] array, int i, int size) {
        
        // TODO: Task 2: Implement MaxHeapify as specified in lab PDF
        /* 𝑙 ← 2𝑖
        𝑟 ← 2𝑖 + 1
        𝐶h𝑖𝑙𝑑𝑟𝑒𝑛 = 𝑛𝑢𝑚𝑏𝑒𝑟𝑜𝑓𝑐h𝑖𝑙𝑑𝑟𝑒𝑛(𝑖,h𝑒𝑎𝑝_𝑠𝑖𝑧𝑒); 
        𝒊𝒇 𝐶h𝑖𝑙𝑑𝑟𝑒𝑛 > 0 𝒕𝒉𝒆𝒏
            𝑙𝑎𝑟𝑔𝑒𝑠𝑡 ← 𝑙
        𝒊𝒇 𝐶h𝑖𝑙𝑑𝑟𝑒𝑛 = 2 𝒂𝒏𝒅𝐴[𝑙] < 𝐴[𝑟] 𝒕𝒉𝒆𝒏
            𝑙𝑎𝑟𝑔𝑒𝑠𝑡 ← 𝑟
        𝒊𝒇𝐴[𝑖] < 𝐴[𝑙𝑎𝑟𝑔𝑒𝑠𝑡] 𝒕𝒉𝒆𝒏
            𝑠𝑤𝑎𝑝(𝐴[𝑖], 𝐴[𝑙𝑎𝑟𝑔𝑒𝑠𝑡])
            𝑀𝑎𝑥𝐻𝑒𝑎𝑝𝑖𝑓𝑦(𝐴, 𝑙𝑎𝑟𝑔𝑒𝑠𝑡, h𝑒𝑎𝑝_𝑠𝑖𝑧𝑒) 
        𝒆𝒏𝒅 */

        int l = 2*i;
        int r = (2*i) + 1;
        int kids = num_children(i, size);
        int largest = i;

        if (kids > 0) {
            largest = l;
        }
        if ((kids == 2) && (array[l] < array[r])) {
            largest = r;
        }
        if (array[i] < array[largest]) { // if i has not children it won't enter this
                swap(i, largest, array);
                heapify(array, largest, size);
        }
    }

    private static int num_children(int parent_index, int size) {
        if (2 * parent_index + 1 <= size)  return 2;
        else if (2 * parent_index <= size) return 1;
        
        return 0;
    }

    private static void swap(int ind1, int ind2, int[] array) {
        int temp = array[ind1];
        array[ind1] = array[ind2];
        array[ind2] = temp;
    }

    private static void print_array(int[] array) {
        System.out.print("[");

        for (int i = 0; i < array.length; ++i)
            System.out.print(array[i] + ((i < array.length - 1) ? "," : ""));

        System.out.println("]");
    }

    public static void main(String[] args) {
        int[] arr1 = {-1, 6,5,4,1,2,3};
        int[] arr2 = {-1,99,19,9,7,11,3,3,2,2,1};
        int[] arr3 = {-1,4,5,1,7,22,13,31,2,4,1};

        heap_sort(arr1);
        heap_sort(arr2);
        heap_sort(arr3);
        print_array(arr1);
        print_array(arr2);
        print_array(arr3);
    }
    
}
