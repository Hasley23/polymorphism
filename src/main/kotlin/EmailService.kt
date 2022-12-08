class EmailService: MessageService() {
    override fun sendMsg(sender: String, receiver: String, msg: String) {
        println("Hello from EmailService!")
        if(sender.contains("@") && receiver.contains("@"))
            super.sendMsg(sender, receiver, msg)
        else
            println("Sender or receiver fields are not valid!")
    }
}