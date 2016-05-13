package edu.unq.vainilla.arkanoid.desktop

import edu.unq.vainilla.arkanoid.{ArkanoidMainScene, GameConfigurator}
import edu.unq.vainilla.desktop.VainillaEngine

object DesktopLauncher {

  def main(args: Array[String]) {
    VainillaEngine.mainScene = new ArkanoidMainScene
    VainillaEngine.configurators += new GameConfigurator
    VainillaEngine.configurators += new DesktopConfigurator
    VainillaEngine.delegateInput //Use this if you want your scenes to handle user input
//    VanillaEngine.inputHandler = new YourInputHandler //Manually set a single input handler

    VainillaEngine.start
  }

}
