import java.util.List;

/**
 * Created by mcccr on 16-10-24.
 */
public class Tlvs {
    public short length;
    public final short type = 2;
    public List<Integer> value;

    public Tlvs(short length, List<Integer> value) {
        this.length = length;
        this.value = value;
    }

    public short getLength() {
        return length;
    }

    public List<Integer> getValue() {
        return value;
    }

    public short getType() {
        return type;
    }

    public int write(Channelbuffer channelbuffer) {
        int a;
        return a;
    }

    public Tlvs read(ChannelBuffer channelBuffer) {

        Tlvs tlv = new Tlvs();
        return tlv;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Tlvs tlvs = (Tlvs) o;

        if (length != tlvs.length) return false;
        if (type != tlvs.type) return false;
        return value != null ? value.equals(tlvs.value) : tlvs.value == null;

    }

    @Override
    public int hashCode() {
        int result = (int) length;
        result = 31 * result + (int) type;
        result = 31 * result + (value != null ? value.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Tlvs{" +
                "length=" + length +
                ", type=" + type +
                ", value=" + value +
                '}';
    }
}
