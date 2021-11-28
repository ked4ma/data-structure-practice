package procon.chap6

import kotlin.math.PI
import kotlin.math.cos
import kotlin.math.sin

object Ch6Q3 {
    fun koch(n: Int) {
        val s = Pair(0.0, 0.0)
        val t = Pair(100.0, 0.0)
        println(s)
        koch(n, s, t)
        println(t)
    }

    private fun koch(n: Int, s: Pair<Double, Double>, t: Pair<Double, Double>) {
        if (n == 0) return
        val ns = (s.first + t.first) / 3 to (s.second + t.second) / 3
        val nt = (s.first + t.first) * 2 / 3 to (s.second + t.second) * 2 / 3
        val t0 = (nt.first - ns.first) to (nt.second - ns.second)
        val nu = Pair(
            t0.first * cos(PI / 3) - t0.second * sin(PI / 3) + ns.first,
            t0.first * sin(PI / 3) + t0.second * cos(PI / 3) + ns.second
        )
        koch(n - 1, s, ns)
        println(ns)
        koch(n - 1, ns, nu)
        println(nu)
        koch(n - 1, nu, nt)
        println(nt)
        koch(n - 1, nt, t)
    }
}