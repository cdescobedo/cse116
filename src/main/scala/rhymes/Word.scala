package rhymes

import scala.annotation.tailrec

class Word(val wordSounds: List[String]) {

  def alliterationLength(word: Word): Int = {
    @tailrec
    def loop(thisWordSounds: List[String], wordSounds: List[String], acc: Int): Int =
      thisWordSounds match {
        case hx::tx =>
          wordSounds match {
            case hy::ty =>
              if(hx == hy) loop(tx, ty, acc + 1) else acc
            case Nil => acc
          }
        case Nil => acc
      }

    loop(this.wordSounds, word.wordSounds, 0)
  }
}
