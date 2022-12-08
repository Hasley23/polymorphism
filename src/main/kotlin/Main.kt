fun main(args: Array<String>) {
    val eService = EmailService()
    val smsService = SMSService()

    print("Input sender's email: ")
    val sender = readln()
    print("Input receiver's email: ")
    val receiver = readln()

    print("Input the message: ")
    val msg = readln()

    try {
        smsService.sendMsg(sender.toInt().toString(), receiver.toInt().toString() , msg)
    } catch (e: Exception){
        eService.sendMsg(sender,receiver,msg)
    }
}