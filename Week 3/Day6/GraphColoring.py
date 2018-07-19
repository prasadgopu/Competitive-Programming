class GraphNode:

    def __init__(self, label):
        self.label = label
        self.neighbors = set()
        self.color = None


def color_graph(graph, colors):

    for node in graph:
        if node in node.neighbors:
            raise Exception('Loop detected!')

        illegal_colors = set()
        for other in node.neighbors:
            if other.color:
                illegal_colors.add(other.color)

        for i in range(len(colors)):
            if colors[i] not in illegal_colors:
                node.color = colors[i]
                break