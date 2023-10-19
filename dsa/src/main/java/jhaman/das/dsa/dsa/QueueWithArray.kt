package jhaman.das.dsa.dsa

class QueueWithArray {
    var arr: IntArray
    var rear = -1

    constructor(size: Int) {
        arr = IntArray(size)
    }

    fun isEmpty() = rear == -1
    fun add(value: Int) {
        if (rear == arr.lastIndex) {
            println("Queue is full can't add more elements")
            return
        }
        rear++
        arr[rear] = value
//        println("size ${arr.size}")

    }


    fun remove(): Int {
        if (isEmpty()) {
            println("Its empty")
            return -1
        }

        val front = arr.first()

        for( i in 0..rear){
            arr[i] = arr[i + 1]
        }
        rear --
        return front
    }

    fun peek(): Int {
        if (isEmpty()) {
            println("Its empty")
            return -1
        }

        return arr.first()
    }
}

fun main(){
    val q = QueueWithArray(5)
    q.add(3)
    q.add(1)
    q.add(2)

    while (!q.isEmpty()){
        println(q.peek())
        q.remove()
    }
}