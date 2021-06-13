package world.cepi.omni

import net.minestom.server.extensions.Extension;

class Omni : Extension() {

    override fun initialize() {
        logger.info("[Omni] has been enabled!")
    }

    override fun terminate() {
        logger.info("[Omni] has been disabled!")
    }

}