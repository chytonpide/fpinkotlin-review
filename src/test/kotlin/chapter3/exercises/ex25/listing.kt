package chapter3.exercises.ex25

import chapter3.Branch
import chapter3.Leaf
import chapter3.Tree
import io.kotlintest.shouldBe
import io.kotlintest.specs.WordSpec
import utils.SOLUTION_HERE

// tag::init[]
fun maximum(tree: Tree<Int>): Int =

    SOLUTION_HERE()
// end::init[]

class Exercise25 : WordSpec({
    "tree maximum" should {
        "!determine the maximum value held in a tree" {
            val tree = Branch(
                Branch(Leaf(1), Leaf(9)),
                Branch(Leaf(3), Leaf(4))
            )
            maximum(tree) shouldBe 9
        }
    }
})
