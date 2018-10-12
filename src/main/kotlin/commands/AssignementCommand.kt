package commands

import keywords.IKeyWord

//class AssignementCommand<T>(
//        override val keyWord: IKeyWord,
//        private val argument: T,
//        override val propertyName: String
//) : ICommand<T>, Bindable {
//    private val internalArgument = argument
//
//    override var value = internalArgument as Any
//
//    override fun execute(): T? {
//        return argument.apply {
//            value = internalArgument as Any
//        }
//    }
//}
//
//interface Bindable {
//    val propertyName: String
//    val value: Any
//}
//
//interface LexicalContext {
//    val assignements: HashMap<String, Bindable>
//}