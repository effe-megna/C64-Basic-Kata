package bindableProperties

import types.StringType

class StringBindableProperty(
        override val key: String,
        override val value: StringType
) : IBindableProperty