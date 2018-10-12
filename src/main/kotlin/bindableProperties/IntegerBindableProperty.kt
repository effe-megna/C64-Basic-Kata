package bindableProperties

import types.IntegerType

class IntegerBindableProperty(
        override val key: String,
        override val value: IntegerType
) : IBindableProperty