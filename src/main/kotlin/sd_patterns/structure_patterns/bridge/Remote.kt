package sd_patterns.structure_patterns.bridge

 open class Remote(val device: Device) {

     fun togglePower(){
         device.enable()
     }

     fun setChannel(n : Int){
         device.channel = n
     }
     fun setVolume(v : Int){
         device.volume = v
     }
}