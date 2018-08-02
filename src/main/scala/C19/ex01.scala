package ch19

object ex01 {

  class Bug {
    private var direction: Int = 1
    private var position: Int = 0

    def move(steps: Int): this.type = {
      position += (steps * direction)
      this
    }

    def show(): this.type = {
      printf("%d ", position)
      this
    }

    def turn(): this.type = {
      direction *= -1
      this
    }
  }

}
