package oop_00000111979_sielynedwiputri.week07

fun main() {
    println("=== TEST SINGLETON ===")
    println("Status: ${DatabaseManager.connectionStatus}")
    DatabaseManager.connect()

    println("\n=== TEST COMPANION OBJECT ===")
    val client = NetworkClient.createClient()
    client.connect()

    println("\n=== TEST REGULAR CLASS ===")
    val reg1 = RegularUser("Alice", 22)
    val reg2 = RegularUser("Alice", 23)
    println(reg1)
    println("Sama? ${reg1 == reg2}")

    println("\n=== TEST DATA CLASS ===")
    val data1 = DataUser("Alice", 22)
    val data2 = DataUser("Alice", 22)
    println(data1)
    println("Sama? ${data1 == data2}")

    val data3 = data1.copy(age = 23)
    println("Hasil Copy: $data3")

    val (userName, userAge) = data1
    println("Destructed: $userName berumur $userAge")

    println("=== TEST SEALED CLASS ===")
    val response: ApiResponse = ApiResponse.Success("Data berhasil ditarik!")

    val uiMessage = when(response) {
        is ApiResponse.Success -> "Tampilkan: ${response.data}"
        is ApiResponse.Error -> "Munculkan alert: ${response.message}"
        ApiResponse.Loading -> "Tampilkan Spinner"
    }
    println(uiMessage)


    println("\n\n=== BAGIAN TUGAS MANDIRI ===")
    GameManager.startGame()
    GameManager.startGame()


    println("Drop chance LEGENDARY: ${ItemRarity.LEGENDARY.dropChance}")
    val starterWeapon = Weapon.forgeStarterSword()
    println("Player membawa senjata: ")
    println("Weapon: ${starterWeapon.item.name}")
    println("Damage: ${starterWeapon.item.damage}")
    println("Durability: ${starterWeapon.durability}")

    println("Pergi ke Blacksmith untuk upgrade senjata...")
    val upgradedItem = starterWeapon.item.copy(damage = 25)
    println("Senjata berhasil di-upgrade!")
    println("Damage ${upgradedItem.name} bertambah menjadi ${upgradedItem.damage}")
    processEvent(BattleState.SafeZone)
    processEvent(
        BattleState.MonsterEncounter("Goblin Nakal")
    )
    processEvent(
        BattleState.LootDropped(upgradedItem)
    )
    processEvent(
        BattleState.GameOver("Terkena jebakan racun")
    )
}