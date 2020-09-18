public class Main {
	public static int x;
	public static int y;
	public static Direction direction;

	public enum Direction {
		UP,
		DOWN,
		LEFT,
		RIGHT
	}

	public Direction getDirection() {
		// текущее направление взгляда
		return this.direction;
	}

	public int getX() {
		// текущая координата X
		return this.x;
	}

	public int getY() {
		// текущая координата Y
		return this.y;
	}

	public void turnLeft() {
		// повернуться на 90 градусов против часовой стрелки
		if (this.direction == Direction.UP) {
			this.direction = Direction.LEFT;
		} else if (this.direction == Direction.LEFT) {
			this.direction = Direction.DOWN;
		} else if (this.direction == Direction.DOWN) {
			this.direction = Direction.RIGHT;
		} else if (this.direction == Direction.RIGHT) {
			this.direction = Direction.UP;
		}
	}

	public void turnRight() {
		// повернуться на 90 градусов по часовой стрелке
		if (this.direction == Direction.UP) {
			this.direction = Direction.RIGHT;
		} else if (this.direction == Direction.RIGHT) {
			this.direction = Direction.DOWN;
		} else if (this.direction == Direction.DOWN) {
			this.direction = Direction.LEFT;
		} else if (this.direction == Direction.LEFT) {
			this.direction = Direction.UP;
		}
	}

	public void stepForward() {
		// шаг в направлении взгляда
		// за один шаг робот изменяет одну свою координату на единицу
		if (this.direction == Direction.UP) {
			this.y++;
		} else if (this.direction == Direction.RIGHT) {
			this.x++;
		} else if (this.direction == Direction.DOWN) {
			this.y--;
		} else if (this.direction == Direction.LEFT) {
			this.x--;
		}
	}

	public Main(int x, int y, Direction direction) {
		this.x = x;
		this.y = y;
		this.direction = direction;
		System.out.println(this.x + " " + this.y + " " + this.direction);
	}

	public static void moveRobot(Main robot, int toX, int toY) {
		if (toX > robot.getX()) {
			while (robot.getDirection() != Direction.RIGHT) {
				robot.turnRight();
			}
		} else {
			while (robot.getDirection() != Direction.LEFT) {
				robot.turnLeft();
			}
		}

		while (robot.getX() != toX) {
			robot.stepForward();
		}

		if (toY > robot.getY()) {
			while (robot.getDirection() != Direction.UP) {
				robot.turnRight();
			}
		} else {
			while (robot.getDirection() != Direction.DOWN) {
				robot.turnLeft();
			}
		}

		while (robot.getY() != toY) {
			robot.stepForward();
		}

		System.out.println(robot.getX() + " " + robot.getY() + " " + robot.getDirection());
	}

	public static void main(String[] args) {
		Main robot = new Main(-5, 3, Direction.DOWN);
		moveRobot(robot, 3, 0);
	}
}
