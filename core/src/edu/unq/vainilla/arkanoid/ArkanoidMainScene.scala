package edu.unq.vainilla.arkanoid

import com.badlogic.gdx.graphics.Texture
import edu.unq.vainilla.core.cords.CordImplicits._
import edu.unq.vainilla.core.gamecomponent.{GameComponent, SimpleGameComponent}
import edu.unq.vainilla.core.gamescene.SimpleGameScene
import edu.unq.vainilla.core.input.{SimpleInputHandler, TouchDown}

class ArkanoidMainScene extends SimpleGameScene with SimpleInputHandler {

  var badlogicLogo: GameComponent = _

  override def create {
    super.create
    val img = new Texture("badlogic.jpg")
    badlogicLogo = new SimpleGameComponent(img)
    components += badlogicLogo
  }

  override def touchDown: PartialFunction[TouchDown, Unit] = {
    case TouchDown(cords, _, _) => badlogicLogo.position = cords
  }

}
