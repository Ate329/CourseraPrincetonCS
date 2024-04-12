public class AudioCollage {
    public static double[] amplify(double[] a, double alpha) {
        double[] result = new double[a.length];
        for (int i = 0; i < a.length; i++) {
            result[i] = a[i] * alpha;
        }
        return result;
    }

    public static double[] reverse(double[] a) {
        double[] result = new double[a.length];
        for (int i = 0; i < a.length; i++) {
            result[i] = a[a.length - 1 - i];
        }
        return result;
    }

    public static double[] merge(double[] a, double[] b) {
        double[] result = new double[a.length + b.length];
        System.arraycopy(a, 0, result, 0, a.length);
        System.arraycopy(b, 0, result, a.length, b.length);
        return result;
    }

    public static double[] mix(double[] a, double[] b) {
        int maxLength = Math.max(a.length, b.length);
        double[] result = new double[maxLength];
        for (int i = 0; i < maxLength; i++) {
            result[i] = (i < a.length ? a[i] : 0) + (i < b.length ? b[i] : 0);
        }
        return result;
    }

    public static double[] changeSpeed(double[] a, double alpha) {
        int newLength = (int) Math.floor(a.length / alpha);
        double[] result = new double[newLength];
        for (int i = 0; i < newLength; i++) {
            result[i] = a[(int) Math.floor(i * alpha)];
        }
        return result;
    }

    public static void main(String[] args) {
        double[] beatbox = StdAudio.read("beatbox.wav");
        double[] chimes = StdAudio.read("chimes.wav");
        double[] cow = StdAudio.read("cow.wav");
        double[] dialup = StdAudio.read("dialup.wav");
        double[] piano = StdAudio.read("piano.wav");

        double[] reversedCow = reverse(cow);
        double[] slowChimes = changeSpeed(chimes, 0.5);
        double[] amplifiedPiano = amplify(piano, 1.5);
        double[] mixedCowDialup = mix(cow, dialup);

        double[] collage = merge(beatbox, reversedCow);
        collage = merge(collage, slowChimes);
        collage = merge(collage, amplifiedPiano);
        collage = merge(collage, mixedCowDialup);

        for (int i = 0; i < collage.length; i++) {
            collage[i] = Math.max(-1.0, Math.min(1.0, collage[i]));
        }

        StdAudio.play(collage);
    }
}
