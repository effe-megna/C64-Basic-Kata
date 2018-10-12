package bindableProperties

import types.PrimitiveType

interface IBindableProperty {
    val key: String
    val value: PrimitiveType
}

