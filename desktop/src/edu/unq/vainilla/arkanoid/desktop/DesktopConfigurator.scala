package edu.unq.vainilla.arkanoid.desktop

import edu.unq.vainilla.core.configuration.{Configuration, Configurator}

class DesktopConfigurator extends Configurator {
  def configure(config: Configuration) = {
    config.width = 800
    config.height = 600
  }
}
