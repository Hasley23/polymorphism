class SMSService: MessageService() {
    override fun sendMsg(sender: String, receiver: String, msg: String) {
        println("Hello from SMS Service!")
        if (sender.length == 9 && receiver.length == 9)
            super.sendMsg(sender, receiver, msg)
        else
            println("Sender or receiver fields are not valid!")
    }
}