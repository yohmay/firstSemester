//  Composite conditional branch
package objectOrientation.objects;

public class CompoundConditional {
    private float average, FirstNote, SecondNote;

    // public void setFirstNote(int varFirstNote);
    // public float getFirstNote();

    // public void setSecondNote(int varSecondNote);
    // public float getSecondNote();

    public void CalculateAverage() {
        average = (FirstNote + SecondNote) / 2;
        if (average >= 8 && average <= 10)
            System.out.println("Conceito A");
        else if (average >= 6 && average < 8)
            System.out.println("Conceito B");
        else if (average >= 4 && average < 6)
            System.out.println("Conceito C");
        else
            System.out.println("Conceito D");
    }
}
