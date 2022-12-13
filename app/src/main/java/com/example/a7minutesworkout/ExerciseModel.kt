class ExerciseModel(private var id:Int,
private var name:String,
private var image:Int,
private var isCompleted:Boolean,
private var isSelected:Boolean){

    fun getId():Int{
        return id
    }

    fun setId(id:Int){
        this.id = id
    }
    fun getname():String{
        return name
    }

    fun setName(name:String){
        this.name = name
    }
    fun getimage():Int{
        return image
    }

    fun setimage(image:Int){
        this.image = image
    }

    fun getIsCompleted():Boolean{
        return isCompleted
    }

    fun setIsCompleted(isCompleted:Boolean){
            this.isCompleted = isCompleted
    }
     fun getisSelected():Boolean{
        return isSelected
    }

    fun setisSelected(isSelected:Boolean){
            this.isSelected = isSelected
    }

}