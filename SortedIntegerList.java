import java.util.*;

public class SortedIntegerList {
	
	private LinkedList<Integer> sortedNumbers;
	private boolean isRepeat;

	public SortedIntegerList(boolean i) {
		isRepeat = i;
		sortedNumbers = new LinkedList<>();
	}	

	public void add(int number) {
		ListIterator<Integer> iter = sortedNumbers.listIterator();
		while (iter.hasNext()) {
			int tmp = iter.next();
			if (tmp > number) {
				iter.previous();
				break;
			}
			if (tmp == number && !(isRepeat)) {
				return;
			}
		}
		iter.add(number);
	}

	public void remove(int number) {
		ListIterator<Integer> iter = sortedNumbers.listIterator();
		while (iter.hasNext()) {
			int tmp = iter.next();
			if (tmp == number) {
				iter.remove();
			}
			if (tmp > number) {
				break;
			}
		}
	}

	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		SortedIntegerList tmp = (SortedIntegerList) obj;
		if (this.sortedNumbers.equals(tmp.sortedNumbers)) {
			return true;
		}
		return false;
	}

	public SortedIntegerList crossing(SortedIntegerList obj) throws SortedIntegerListException{
		if (this.isRepeat != obj.isRepeat) {
			throw new SortedIntegerListException("Cross error: different repeat mode", 2);
		}
		if (this.equals(obj)) {
			return this;
		}
		SortedIntegerList answer = new SortedIntegerList(this.isRepeat);
		ListIterator<Integer> thisIter = this.sortedNumbers.listIterator();
		ListIterator<Integer> objIter = obj.sortedNumbers.listIterator();
		ListIterator<Integer> answerIter = answer.sortedNumbers.listIterator();
		while (thisIter.hasNext()) {
			int thisNumber = thisIter.next();
			while (objIter.hasNext() ) {
				int objNumber = objIter.next();
				if (thisNumber == objNumber) {
					answer.add(objNumber);
					break;
				}
				if (thisNumber < objNumber) {
					objIter.previous();
					break;
				}
			}
		}
		return answer;
	}

	public String toString() {
		return this.sortedNumbers.toString();
	}

}
//добавить метод возвращает новый список на основании двух других = пересечение двух предыдущих списков и исключение если разные флажки


















