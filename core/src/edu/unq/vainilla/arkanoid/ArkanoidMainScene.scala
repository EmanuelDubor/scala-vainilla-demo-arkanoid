package edu.unq.vainilla.arkanoid

import com.badlogic.gdx.graphics.Texture
import com.badlogic.gdx.graphics.g2d.SpriteBatch
import com.badlogic.gdx.math.Vector3
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

  override def render(implicit spriteBatch: SpriteBatch, deltaTime: Float): Unit = {
    super.render
    spriteBatch.draw(logo, imgX, imgY)
  }

  override def touchDown: PartialFunction[TouchDown, Unit] = {
    case TouchDown(x, y, _, _) =>
      val vector = camera.unproject(new Vector3(x, y, 0))
      imgX = vector.x
      imgY = vector.y
  }
}
