Be careful with JPA using model classes
---------------------------------------
As soon as you try to use model classes with a type binder you will stumble upon strange behavior, 
as your objects will always only have null or default values when freshly instanced. 
The JPA plugin already uses a binding and overwrites every binding you are doing.