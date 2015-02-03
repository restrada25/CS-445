JFLAGS = -g
JC = javac
.SUFFIXES: .java .class
.java.class:
        $(JC) $(JFLAGS) $*.java

CLASSES = \
	Thing.java \
        Creature.java \
        Ant.java \
        Tiger.java \
	Flyer.java \
	Fly.java \
	Bat.java \
	TestCreature.java

default: classes

classes: $(CLASSES:.java=.class)

clean:
        $(RM) *.class
