package edu.unq.vainilla.arkanoid.desktop

import edu.unq.vainilla.arkanoid.{ArkanoidMainScene, GameConfigurator}
import edu.unq.vainilla.desktop.VainillaEngine

object DesktopLauncher extends App {

  VainillaEngine.mainScene = new ArkanoidMainScene
  VainillaEngine.configurators += new GameConfigurator
  VainillaEngine.configurators += new DesktopConfigurator
  VainillaEngine.delegateInput

  VainillaEngine.start

}
