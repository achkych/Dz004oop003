����   = ^
      java/lang/Object <init> ()V  	 
   java/util/List iterator ()Ljava/util/Iterator;      java/util/Iterator hasNext ()Z     next ()Ljava/lang/Object;  java/lang/Number
     doubleValue ()D
     ! " java/lang/Integer toBinaryString (I)Ljava/lang/String;
 $ % & ' ( java/lang/Math round (D)J
 * + , ! - java/lang/Long (J)Ljava/lang/String;
  / 0 1 parseInt (Ljava/lang/String;)I
 3 4 5 6 " 
Calculator binaryConversion 8 java/lang/NumberFormatException
 : ; < = > java/lang/Double parseDouble (Ljava/lang/String;)D
 3 @ 6 A (D)Ljava/lang/String; Code LineNumberTable LocalVariableTable this LCalculator; sum (Ljava/util/List;)D number Ljava/lang/Number; numbers Ljava/util/List; result D LocalVariableTypeTable %Ljava/util/List<+Ljava/lang/Number;>; StackMapTable 	Signature ((Ljava/util/List<+Ljava/lang/Number;>;)D I roundedValue J &(Ljava/lang/String;)Ljava/lang/String; e !Ljava/lang/NumberFormatException; input Ljava/lang/String; 
SourceFile Calculator.java ! 3           B   /     *� �    C        D        E F    G H  B   �     -I+�  :�  � �  � :(� cI���(�    C             ( 	 + 
 D   *     I J    - E F     - K L   + M N  O       - K P  Q    � 
 �   R    S  6 "  B   9     � �    C        D        E F      I T   6 A  B   L     
'� #B!� )�    C   
       D        
 E F     
 I N    U V   6 W  B   �     +� .=*� 2�M+� 9J*)� ?�    
  7  C                D   4    I T     N    X Y     E F      Z [  Q    K 7  \    ]