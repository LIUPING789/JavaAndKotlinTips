package com.knight.mykotlinfirst.samples9

/**
 * description: ${TODO}
 * autour: Knight
 * new date: 2018/5/10 on 09:06
 * e-mail: 37442216knight@gmail.com
 * update: 2018/5/10 on 09:06
 * version: v 1.0
 */
/**
 * 常见的装饰器模式，为了修改部分涵数，却需要实现所有的接口
 */
class CountingSet<T>(val innerSet: MutableCollection<T> = HashSet<T>()) : MutableCollection<T> {
    override fun containsAll(elements: Collection<T>): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    var objectAdded = 0
    override val size: Int
        get() = innerSet.size //TODO("not implemented") //To change initializer of created properties use File | Settings | File Templates.

    /**
     * 需要修改的方法
     */
    override fun add(element: T): Boolean {
        objectAdded++
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        return innerSet.add(element)
    }

    /**
     * 需要修改的方法
     */
    override fun addAll(element: Collection<T>): Boolean {
        objectAdded += element.size
        return innerSet.addAll(element)
    }

    override fun contains(element: T): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        return innerSet.contains(element)
    }

    override fun isEmpty(): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        return innerSet.isEmpty()
    }

    override fun clear() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        innerSet.clear()
    }

    override fun iterator(): MutableIterator<T> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        return innerSet.iterator()
    }

    override fun remove(element: T): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        return innerSet.remove(element)
    }

    override fun removeAll(elements: Collection<T>): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        return innerSet.removeAll(elements)
    }

    override fun retainAll(elements: Collection<T>): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        return innerSet.retainAll(elements)
    }
}

/**
 * 通过by 关键字将接口的实现委托给innerSet成员变量 ，需要修改的涵数再去 override 就可以了
 */
class CountingSet2<T>(val innerSet: MutableCollection<T> = HashSet<T>()) : MutableCollection<T> by innerSet {
    var objectAdded = 0
    override fun add(element: T): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        objectAdded++
        return innerSet.add(element)
    }

    override fun addAll(elements: Collection<T>): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        objectAdded += elements.size
        return innerSet.addAll(elements)
    }
}