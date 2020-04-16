package array;

public interface ArrayInterface<E> {
    int getSize();

    int getCapacity();

    boolean isEmpty();

    /**
     * 在第index个位置插入一个新元素e
     */
    void add(int index, E e);

    void addLast(E e);

    void addFirst(E e);

    /**
     * 获取index索引位置的元素
     */
    E get(int index);

    /**
     * 修改Index索引位置的元素为e
     */
    void set(int index, E e);

    /**
     * 查找数组中是否有元素e
     */
    boolean contains(E e);

    /**
     * 查找数组中元素e所在的索引，如果不存在元素e，则返回-1
     */
    int find(E e);

    /**
     * 从数组中删除index位置的元素，返回删除的元素
     */
    E remove(int index);

    /**
     * 从数组中删除第一个元素，返回删除的元素
     */
    E removeFirst();

    /**
     * 从数组中删除最后一个元素，返回删除的元素
     */
    E removeLast();

    /**
     * 从数组中删除元素e
     */
    void removeElement(E e);

    void resize(int newCapacity);
}
