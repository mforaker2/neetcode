class DynamicArray {

    int[] arr;
    int capacity;
    int endOfArrPointer; 

    public DynamicArray(int capacity) {
        this.capacity = capacity;
        endOfArrPointer = 0; 
        arr = new int[capacity];
    }

    public int get(int i) {
        return arr[i];
    }

    public void set(int i, int n) {
        arr[i] = n;
    }

    public void pushback(int n) {
        if (endOfArrPointer == capacity)
            resize();
        arr[endOfArrPointer] = n;
        endOfArrPointer++; 
    }

    public int popback() {
        int removedElement = arr[endOfArrPointer-1];
        arr[endOfArrPointer-1] = 0;
        endOfArrPointer--;
        return removedElement;
    }

    private void resize() {
        capacity = capacity * 2; 
        int[] resizedArr = new int[capacity];
        for (int i = 0; i < arr.length; i++) {
            resizedArr[i] = arr[i];
        }
        arr = resizedArr;
    }

    public int getSize() {
        return endOfArrPointer;
    }

    public int getCapacity() {
        return arr.length; 
    }
}
