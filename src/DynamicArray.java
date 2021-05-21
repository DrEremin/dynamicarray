/**
 * Dynamic array data structure
 */

public class DynamicArray <T> {

    final int MINIMUM_CAPACITY = 1;
    protected int size;
    protected int capacity;
    protected T[] array;

    DynamicArray() {
        size = 0;
        capacity = 1;
        array = (T[])new Object[capacity];
    }

    DynamicArray(int size) {
        this.size = 0;
        capacity = size;
        array = (T[])new Object[size];
    }

    DynamicArray(int size, T defaultValue) {
        capacity = size;
        array = (T[])new Object[size];
        this.size = size;
        for (int i = 0; i < size; i++) {
            array[i] = defaultValue;
        }
    }

    public T get(int i) {
        if (i >= size || i < 0) {
            throw new IndexOutOfBoundsException();
        }
        return array[i];
    }

    public void set(int i, T val) {
        if (i >= size || i < 0) {
            throw new IndexOutOfBoundsException();
        } else {
            array[i] = val;
        }
    }

    /**
     * Push new element in the end of array
     *
     * @param value value that will be pushed
     */

    public void pushBack(T value) {
        if (size >= capacity) {
            increaseCapacity();
        }
        array[size++] = value;
    }

    /**
     * Push new element at the defined position
     * in the array
     *
     * @param value value that will be pushed
     */

    public void pushBack(int i, T value) {
        if (i > size || i < 0) {
            throw new IndexOutOfBoundsException();
        } else {
            if (size >= capacity) {
                increaseCapacity();
            }
            for (int j = size++; j > i; j--) {
                array[j] = array[j - 1];
            }
            array[i] = value;
        }
    }

    /**
     * Remove last element from array
     */

    public void popBack() {
        if (size == 0) {
            return;
        }
        if (--size * 2 < capacity) {
            decreaseCapacity();
        }
    }

    /**
     * Remove defined element from array
     */

    public void popBack(int i) {
        if (i >= size || i < 0) {
            throw new IndexOutOfBoundsException();
        } else {
            for (int j = i; j < size - 1; j++) {
                array[j] = array[j + 1];
            }
            if (--size * 2 < capacity) {
                decreaseCapacity();
            }
        }
    }

    /**
     * Get array size
     *
     * @return size
     */
    public int getSize() {
        return size;
    }

    /**
     * Get current capacity
     *
     * @return capacity
     */
    public int getCapacity() {
        return capacity;
    }

    /**
     *  Increase the capacity to double
     */

    private void increaseCapacity() throws NullPointerException {
        capacity *= 2;
        reallocateArray();
    }

    /**
     * Decrease the capacity to double
     *
     * Capacity should be at least 2 * MINIMUM_CAPACITY
     */
    private void decreaseCapacity() throws NullPointerException {
        if (MINIMUM_CAPACITY * 2 <= capacity / 2) {
            capacity /= 2;
        }
        reallocateArray();
    }

    /**
     * Allocate new array with capacity size and delete old
     *
     * Sould be called only when capacity changed
     *
     * Capacity must be valid
     */

    private void reallocateArray() {
        T[] arrayNew = null;
        try {
            arrayNew = (T[])new Object[capacity];
            for (int i = 0; i < size; i++) {
                arrayNew[i] = array[i];
            }
            array = arrayNew;
        } catch (NullPointerException e) {
            throw e;
        }
    }
}
