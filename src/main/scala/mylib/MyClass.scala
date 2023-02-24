package mylib
import spinal.core._
import spinal.lib.experimental.math._

class MyClass extends Component {
    val io = new Bundle {
        val output = out(UInt(8 bits))
        val enable = in(Bool)
    }

    val cnt = Reg(UInt(8 bits))
    io.output := cnt

    when (io.enable) {
        cnt := cnt + 1
    }
}