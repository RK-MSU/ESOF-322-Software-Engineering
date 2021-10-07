# ESOF-322 Notes

## Chpater 7 - Modeling Ordered Interactions: Sequence Diagrams

### Events, Signals, and Messages

#### Message Signatures

A message arrow comes with a description, or signature. The format for a message signature is:

    attribute = signal_or_message_name (arguments) : return_type

You can specify any number of different arguments on a message, each separated
using a comma. The format of an argument is:

    <name>:<class>

| Type | Parameters | Why is it useful? |
| :-- | :-- | :-- |
| ref | None | Represents an interaction that is defined elsewhere in the model. Helps you manage a large diagram by splitting, and potentially reusing, a collection of interactions. Similar to the reuse modeled when the `<<include>>` use case relationship is applied. |
| assert | None | Specifies that the interactions contained within the fragment box must occur exactly as they are indicated; otherwise the fragment is declared invalid and an exception should be raised. Works in a similar fashion to the `assert` statement in Java. Useful when specifying that every step in an interaction must occur |
| loop | min times, max times, [guard_condition] | |
| break | None | |
