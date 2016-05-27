package edu.unq.vainilla.arkanoid

import com.badlogic.gdx.graphics.Texture
import com.badlogic.gdx.graphics.g2d.SpriteBatch
import edu.unq.vainilla.core.gamescene.SimpleGameScene
import edu.unq.vainilla.core.input.{SimpleInputHandler, TouchDown}

class ArkanoidMainScene extends SimpleGameScene with SimpleInputHandler {

  var logo: Texture = _
  var imgX: Float = 0
  var imgY: Float = 0

  override def create {
    super.create
    logo = new Texture("badlogic.jpg")
  }

  override def render(implicit spriteBatch: SpriteBatch): Unit = {
    super.render
    spriteBatch.draw(logo, imgX, imgY)
  }

  override def touchDown: PartialFunction[TouchDown, Unit] = {
    case TouchDown(screenCords, _, _) =>
      val cords = screenCords.localize
      imgX = cords.x
      imgY = cords.y
  }
}
