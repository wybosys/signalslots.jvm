package com.nnt.signals

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class Test {

    @Test
    fun Test0() {
        var C = 0
        val a = Object()
        a.signals.register("a")
        a.signals.connect("a") {
            C++
        }
        a.signals.emit("a")
        Assertions.assertEquals(C, 1)
        a.signals.disconnect("a")
        a.signals.emit("a")
        Assertions.assertEquals(C, 1)
    }
}