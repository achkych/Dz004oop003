����   = }
      java/lang/Object <init> ()V  
Calculator
  @       
      java/lang/Double valueOf (D)Ljava/lang/Double;@      @            java/util/List of H(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/List;	      ! java/lang/System out Ljava/io/PrintStream;
  # $ % sum (Ljava/util/List;)D   ' ( ) makeConcatWithConstants (D)Ljava/lang/String;
 + , - . / java/io/PrintStream println (Ljava/lang/String;)V
 1 2 3  4 java/lang/Integer (I)Ljava/lang/Integer;  '
  7 8 9 binaryConversion (I)Ljava/lang/String;  ; ( < '(ILjava/lang/String;)Ljava/lang/String;@      
  @ 8 )  B ( C '(DLjava/lang/String;)Ljava/lang/String; E 7
  G 8 H &(Ljava/lang/String;)Ljava/lang/String;  J ( K 8(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; M Main Code LineNumberTable LocalVariableTable this LMain; main ([Ljava/lang/String;)V args [Ljava/lang/String; 
calculator LCalculator; 
doubleList Ljava/util/List; integerList intValue I 	binaryInt Ljava/lang/String; doubleValue D binaryDouble stringInput binaryString LocalVariableTypeTable $Ljava/util/List<Ljava/lang/Double;>; %Ljava/util/List<Ljava/lang/Integer;>; 
SourceFile 	Main.java BootstrapMethods l
 m n o ( p $java/lang/invoke/StringConcatFactory �(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; r Сумма doubleList:  t Сумма integerList:  v ;Бинарное представление числа :  InnerClasses y %java/lang/invoke/MethodHandles$Lookup { java/lang/invoke/MethodHandles Lookup ! L           N   /     *� �    O        P        Q R   	 S T  N  y     �� Y� 	L 
�  �  � � M� +,� "� &  � *� 0� 0� 0� N� +-� "� 5  � *
6+� 6:� � :  � * =9+� ?:� � A  � *D:	+	� F:
� 	
� I  � *�    O   >         . 
 >  N  R  Z  i  n  v  �  �  �  �  P   f 
   � U V    � W X   � Y Z  > c [ Z  R O \ ]  Z G ^ _  n 3 ` a  v + b _  �  c _ 	 �  d _ 
 e      � Y f  > c [ g   h    i j     k  q k  s k  u w   
  x z | 