package edu.unq.vainilla.arkanoid

import edu.unq.vainilla.core.configuration.{Configuration, Configurator}

class GameConfigurator extends Configurator {
  def configure(config: Configuration) = {
    config.title = "Scala Vainilla Arkanoid Demo"
    config.mainScene = new ArkanoidMainScene
    config.delegateInput
  }
}
