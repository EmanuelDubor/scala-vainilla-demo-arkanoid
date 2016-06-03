package edu.unq.vainilla.arkanoid.desktop

import edu.unq.vainilla.arkanoid.GameConfigurator
import edu.unq.vainilla.desktop.VainillaEngine

object DesktopLauncher extends App {

  VainillaEngine.configurators += new GameConfigurator
  VainillaEngine.configurators += new DesktopConfigurator

  VainillaEngine.start

}
