rootProject.name = "izanagi-librarian"

include(":izanagi-librarian-shared")

include(":izanagi-librarian-bukkit")
include(":izanagi-librarian-velocity")

include(":izanagi-librarian-plugin-bukkit")
project(":izanagi-librarian-plugin-bukkit").name = "Izanagi-Librarian-Bukkit"

include(":izanagi-librarian-plugin-velocity")
project(":izanagi-librarian-plugin-velocity").name = "Izanagi-Librarian-Velocity"
