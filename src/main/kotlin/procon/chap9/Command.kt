package procon.chap9

sealed interface Command

data class Insert(val value: Int) : Command
object Print : Command

data class Find(val value: Int) : Command
data class Delete(val value: Int) : Command