import java.time.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public abstract class MonthlySelection {
	protected MonthlySelectionType mst;
	private YearMonth ym;
	private List<Wine> ms = new ArrayList<Wine>();
	
	abstract void addWine(Wine w);
	
	public boolean isMatch(String kw) {
		Iterator<Wine> it = this.ms.iterator();
		while (it.hasNext()) {
			Wine w = it.next();
			if (w.isMatch(kw)) return true;
		}
		return false;
	}
	
	public MonthlySelection() {
		this.ym = YearMonth.now().plusMonths(1);	// next month's selection
	}
	
	public MonthlySelection(String ym) {	// Must be in the yyyy-mm format
		this.ym = YearMonth.parse(ym);
	}
}
