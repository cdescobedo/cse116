package rhymes

import org.junit.runner.RunWith
import org.scalatest.funsuite.AnyFunSuite
import org.scalatestplus.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class TestWords extends AnyFunSuite {
  val wordSoundsComplete = List("AH", "MEH", "RIH", "CAH")
  val wordSoundsPartial = List("AH", "MEH")
  val wordSoundsOther = List("MIS", "TER")
  val wordOne = new Word(wordSoundsComplete)
  val wordTwo = new Word(wordSoundsComplete)
  val wordThree = new Word(wordSoundsPartial)
  val wordFour = new Word(wordSoundsOther)

  test("Verify that the alliteration length method computes the correct result for two words") {
    assert(wordOne.alliterationLength(wordTwo) == 4, (wordOne.wordSounds, wordTwo.wordSounds))
    assert(wordOne.alliterationLength(wordThree) == 2, (wordOne.wordSounds, wordThree.wordSounds))
    assert(wordOne.alliterationLength(wordFour) == 0, (wordOne.wordSounds, wordFour.wordSounds))
  }
}
