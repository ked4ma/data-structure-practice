package procon.chap4

object Ch4Q3 {
    fun run(tasks: List<Pair<String, Int>>, limit: Int) {
        val queue = Queue<Pair<String, Int>>(tasks.size * 2)
        tasks.forEach(queue::enqueue)
        var time = 0
        while (!queue.isEmpty()) {
            val task = queue.dequeue()
            if (task.second > limit) {
                time += limit
                queue.enqueue(task.first to task.second - limit)
            } else {
                time += task.second
                println("${task.first} $time")
            }
        }
    }
}