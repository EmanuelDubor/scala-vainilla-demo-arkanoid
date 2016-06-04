package edu.unq.vainilla.arkanoid

import edu.unq.vainilla.core.appearence.Appearence
import edu.unq.vainilla.core.cords.CordImplicits._
import edu.unq.vainilla.core.gamecomponent.SimpleGameComponent
import edu.unq.vainilla.core.gamescene.SimpleGameScene
import edu.unq.vainilla.core.input.{SimpleInputHandler, TouchDown}

class ArkanoidMainScene extends SimpleGameScene with SimpleInputHandler {

  val circleRadius = 30
  var markerAppearence: Appearence = _

  override def create {
    import com.badlogic.gdx.graphics.Color._
    import edu.unq.vainilla.core.appearence.AppearenceDSL._

    super.create
    markerAppearence = SolidCircle(circleRadius, BLUE)
  }

  override def touchDown: PartialFunction[TouchDown, Unit] = {
    case TouchDown(cords, _, _) => components += new SimpleGameComponent(markerAppearence, cords +(-circleRadius, -circleRadius))
  }

}
